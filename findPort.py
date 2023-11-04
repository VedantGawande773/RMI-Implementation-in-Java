import socket
import subprocess

def find_available_port():
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.bind(('127.0.0.1', 0))
    port = s.getsockname()[1]
    s.close()
    return port


if __name__ == "__main__":
    available_port = find_available_port()
    print("Available port:", available_port)
    

