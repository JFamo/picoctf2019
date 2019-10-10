import socket
import time

hostname = "2019.shell1.picoctf.com"
port = 41419

connection = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
connection.connect((hostname, port))
connection.setblocking(False)

time.sleep(0.25)

def receive_line(con):
	result = ""
	while True:
		data = con.recv(1).decode()
		if(data == "\n"):
			print(result)
		else:
			result += data

line1 = receive_line(connection)
print(line1)

# 256931246631782714357241547977711772463921289855697036691635615632398348845781751088536642911548558380669785060856845380453953547977443596019539133122328972818012171271262915095894127395939370736605222395073665371726461928496239911322865437260751832391343193004943242792776757140326813854100952417297955540862318184529173589172738628535586766682054481614303814502940919014793486222709876210909670258436711953594281532116053963117423718797887144760360749619552577176382615108244813