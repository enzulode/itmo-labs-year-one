
# TASK 1
# current directory: /home/s367811

mkdir lab0
cd lab0

# current directory: /home/s367811/lab0

mkdir cherrim3
mkdir cherrim3/slakoth
mkdir cherrim3/scrafty
mkdir cherrim3/vanilluxe
mkdir cherrim3/tympole
mkdir cherrim3/beldum
touch cherrim3/dustox

touch milotic6
touch porygon27

mkdir sunflora8
touch sunflora8/tentacool
mkdir sunflora8/sewaddle
mkdir sunflora8/ariados

mkdir tangela1
mkdir tangela1/nuzleaf
mkdir tangela1/roselia
mkdir tangela1/marshtomp
mkdir tangela1/walrein
touch tangela1/yamask
mkdir tangela1/mamoswine

touch woobat1

echo "Тип диеты  Herbivore" >> cherrim3/dustox

echo "Возможности  Overland=6" >> milotic6
echo "Surface=11 Underwater=11 Jump4=0 Power=4 Intelligence=4" >> milotic6
echo "Gilled=0" >> milotic6

echo "Тип диеты  Nullivore" >> porygon27

echo "Тип диеты" >> sunflora8/tentacool
echo "Carnivore" >> sunflora8/tentacool

echo "Тип диеты  Terravore" >> tangela1/yamask

echo "Развитые способности" >> woobat1
echo "Simple" >> woobat1


# TASK 2
# current directory: /home/s367811/lab0

chmod u=rwx,g=rx,o=wx cherrim3
chmod 305 cherrim3/slakoth
chmod u=wx,g=wx,o=rx cherrim3/scrafty
chmod u=wx,g=wx,o=rx cherrim3/vanilluxe
chmod 550 cherrim3/tympole
chmod 337 cherrim3/beldum
chmod u=r,g=r,o= cherrim3/dustox
chmod 644 milotic6
chmod 066 porygon27
chmod u=rx,g=x,o=w sunflora8
chmod 444 sunflora8/tentacool
chmod u=rx,g=rwx,o=rwx sunflora8/sewaddle
chmod 550 sunflora8/ariados
chmod u=rwx,g=wx,o=rwx tangela1
chmod u=wx,g=wx,o=rx tangela1/nuzleaf
chmod 357 tangela1/roselia
chmod u=rx,g=rwx,o=rw tangela1/marshtomp
chmod u=rwx,g=wx,o=wx tangela1/walrein
chmod u=,g=r,o=r tangela1/yamask
chmod u=wx,g=rwx,o=rx tangela1/mamoswine
chmod u=rw,g=r,o= woobat1

# TASK 3

chmod u=r porygon27 #permission denied fix
chmod u=rwx sunflora8 #permission denied fix
cat porygon27 >> sunflora8/tentacoolporygon2

ln -s $HOME/lab0/sunflora8 $HOME/lab0/Copy_7
ln milotic6 tangela1/yamaskmilotic

chmod u=rwx sunflora8/ariados #permission denied fix
cp porygon27 sunflora8/ariados 

cp -r sunflora8 cherrim3/beldum

chmod u=r tangela1/yamask #permission denied fix
cat tangela1/yamask >> porygon27_49 
cat sunflora8/tentacool >> porygon27_49

ln -s $HOME/lab0/woobat1 $HOME/lab0/tangela1/yamaskwoobat

# TASK 4

# 1)
echo "Subtask #1"
wc -l tangela1/* 2> /tmp/perm-errors | sort -k1n -r
echo ""

# 2)
echo "Subtask #2"
cd ../
ls -lR lab0 2> /tmp/perm-errors | grep -P "^-.* s.*$" | sort -k5n -r
# no such files
cd lab0
echo ""

# 3)
echo "Subtask #3"
cd ../
grep -rhn . lab0/sunflora8/* 2> /tmp/perm-errors | grep "te"
cd lab0
echo ""

# 4)
echo "Subtask #4"
cd ../
ls -lR lab0 2> /dev/null | grep -G "^-.*1$" | sort -k2n
cd lab0
echo ""

# 5)
echo "Subtask #5"
cd ../
ls -ltR lab0 | grep -G "^-.*$" | tail -n 2
cd lab0
echo ""

# 6)
echo "Subtask #6"
cd ../
ls -lR lab0 2> /tmp/perm-errors | grep -G "^-.*1$" | sort -k2n | head -n 2
cd lab0
echo ""


# TASK 5

rm -f porygon27
rm -f tangela1/yamask
rm -f Copy*
rm -f tangela1/yamaskmilot*

chmod u=rwx cherrim3/beldum # permission denied fix
rm -rf cherrim3

rmdir tangela1/nuzleaf