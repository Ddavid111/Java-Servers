import requests
import time
import sys
import re

if len(sys.argv) < 2:
    print("Használat: python measure_response_times.py <URL>")
    sys.exit(1)

url = sys.argv[1]
iterations = 1000

server_name = re.sub(r'^https?://[^/]+/', '', url)
server_name = server_name.split('/')[0]
output_file = f"{server_name}_responsetimes.txt"

times = []

with open(output_file, "w") as f:
    for i in range(iterations):
        start = time.time()
        try:
            response = requests.get(url)
            response.raise_for_status()
        except Exception as e:
            print(f"Hiba a kérésnél: {e}")
            times.append(None)
            f.write("ERROR\n")
            continue
        end = time.time()
        elapsed = end - start
        times.append(elapsed)
        f.write(f"{elapsed}\n")

clean_times = [t for t in times if t is not None]
if clean_times:
    avg_time = sum(clean_times) / len(clean_times)
    min_time = min(clean_times)
    max_time = max(clean_times)
    print(f"Átlagos válaszidő: {avg_time:.4f} másodperc")
    print(f"Minimum válaszidő: {min_time:.4f} másodperc")
    print(f"Maximum válaszidő: {max_time:.4f} másodperc")
else:
    print("Nem érkezett érvényes válaszidő.")
