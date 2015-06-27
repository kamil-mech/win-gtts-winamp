del gtts.log
set INPUT=%*
set INPUT=%INPUT:"=%
node say.js "%INPUT%" > gtts.log