#!/usr/bin/python

from SOAPpy import SOAPProxy
from time import sleep
import unicodedata
import sys

username = 'jalatif'
password = 'Caroline'
url = "http://ideone.com/api/1/service"
server = SOAPProxy(url)
slanguages = server.getLanguages(username, password)

#languages = {}
#write_index = open("languages_index.txt", "w")
#for i in range(0, len(slanguages[0][1][1][0])):
#	lang_id = slanguages[0][1][1][0][i]['key']
#	lang    = slanguages[0][1][1][0][i]['value']
#	languages[lang] = lang_id;
#	content = lang + "\t->\t" + str(lang_id)+"\n"
#	write_index.write(content)
#write_index.close()

lang = int(sys.argv[2])
code = """#include<stdio.h>
int main() {
printf("hello Jalatif");
return 0;
}
"""

code_file = open(sys.argv[1], 'r')
code = code_file.read()
code_file.close()

inputer = 0
run = True
private = False

result = server.createSubmission(username, password, code, lang, inputer, run, private);

error =  result[0][0]['value']
link  =  result[0][1]['value']


output = ""
stderr = ""
cmpinfo = ""
time = ""
memory = ""

if (error == "OK"):
	status = server.getSubmissionStatus(username, password, link);
	#print status
	
	st_error = status[0][0]['value']
	
	if (error == "OK"):
		while (status[0][1]['value'] != 0):
			sleep(3)
			status = server.getSubmissionStatus(username, password, link);
		
		details = server.getSubmissionDetails(username, password, link, True, True, True, True, True);
		dt_error = details[0][0]['value']
		if (dt_error == "OK"):
			#print details
			#print "Output = "
			for i in range(0, len(details[0])):
				keyring   = details[0][i]['key']
				valuering = details[0][i]['value']
				if keyring == "output":
					output = valuering
				if keyring == "stderr":
					stderr = valuering
				if keyring == "time":
					time = valuering
				if keyring == "memory":
					memory = valuering
				if keyring == "cmpinfo":
					cmpinfo = valuering
			print output, stderr, time, memory 
			try:
				unicodedata.normalize('NFKD', cmpinfo).encode('ascii', 'ignore')
			except:
				pass
			print cmpinfo
		else:
			print "An Error Occured"
			print details
	else:
		print "An Error Occured"
		print status
else:
	print "An Error Occured"
	print result	

