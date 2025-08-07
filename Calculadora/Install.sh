#! /bin/bash
cd ~/Descargas/
wget https://github.com/yulmio/Calculo/archive/refs/heads/master.zip
mkdir -p /home/yulmio/Programas/
mv master.zip /home/yulmio/Programas/
cd /home/yulmio/Programas/
unzip master.zip
rm -f master.zip
cd Calculo-master #esto es una carpeta no hace falta extencion verdad?
cd Calculadora
java Calculadora





