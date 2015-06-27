var cp = require('child_process')
var fs = require('fs')
var filename = './temp.mp3'

if (fs.existsSync(filename)) fs.unlinkSync(filename);

console.log('processing "' + process.argv[2] + '"')
cp.exec('python GoogleTTS.py -o temp.mp3 -s \"' + process.argv[2] + '\" -l pl')

while (!fs.existsSync(filename)) ;
console.log('ok')

setTimeout(function(){cp.exec('winamp temp.mp3')}, 1000)
