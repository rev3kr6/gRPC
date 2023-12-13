#!/bin/bash
sudo apt-get update

# MySQL
sudo apt-get install mysql-server
sudo mysql_secure_installation

# REST API Java
sudo apt install openjdk-17-jdk

# DB Server Python
sudo apt-get install python3-pip
pip3 install grpcio
pip3 install grpcio-tools
pip3 install pymysql

# For test
sudo apt-get install curl