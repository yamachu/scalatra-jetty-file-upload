.PHONY: build run

build:
	docker build . -t repro:latest

run: build
	docker run -p "8080:8080" repro:latest

request/201: Dummy.txt
	curl -i -X POST localhost:8080/will-fail/ -H "Content-Type: multipart/form-data" -F "data=@Dummy.txt"

request/413: LargeDummy.txt
	curl -i -X POST localhost:8080/will-fail/ -H "Content-Type: multipart/form-data" -F "data=@LargeDummy.txt"

Dummy.txt:
	echo "Hello, World!" > Dummy.txt

LargeDummy.txt:
	head -n 1025 /dev/urandom > LargeDummy.txt
