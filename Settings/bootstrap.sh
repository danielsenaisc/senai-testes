#Amazon
#yum -y install wget
#

#Local
sed -i -e 's/mirrorlist/#mirrorlist/' /etc/yum.repos.d/CentOS-Base.repo
sed -i -e 's/#baseurl/baseurl/' /etc/yum.repos.d/CentOS-Base.repo
#

#yum -y update
yum -y install unzip
yum -y install libaio bc
yum -y install httpd
chkconfig httpd on

#
#LIBERANDO AS PORTAS
sed -i '11 i\-A INPUT -m state --state NEW -m tcp -p tcp --dport 8080 -j ACCEPT' /etc/sysconfig/iptables
sed -i '11 i\-A INPUT -m state --state NEW -m tcp -p tcp --dport 5050 -j ACCEPT' /etc/sysconfig/iptables
sed -i '11 i\-A INPUT -m state --state NEW -m tcp -p tcp --dport 1521 -j ACCEPT' /etc/sysconfig/iptables
sed -i '11 i\-A INPUT -m state --state NEW -m tcp -p tcp --dport 6060 -j ACCEPT' /etc/sysconfig/iptables
service iptables restart
#
#
#JRE
wget --no-check-certificate -c --header "Cookie: oraclelicense=accept-securebackup-cookie" http://download.oracle.com/otn-pub/java/jdk/7/jre-7-linux-x64.rpm
rpm -ivh jre-7-linux-x64.rpm
echo "export JAVA_HOME=/usr/java/default" >> /etc/profile
source /etc/profile
#
#
#TOMCAT
wget https://olex-secure.openlogic.com/content/private/5e6a6f0815e830bba705e79e4a0470fbee8a5880//olex-secure.openlogic.com/apache-tomcat-7.0.54.tar.gz
tar -xvzf apache-tomcat-7.0.54.tar.gz

sed -i '36 i\ <user username="manager" password="@Senai2014" roles="manager-gui, admin-gui"/>' /home/vagrant/apache-tomcat-7.0.54/conf/tomcat-users.xml
sed -i '36 i\ <role rolename="admin-gui"/>' /home/vagrant/apache-tomcat-7.0.54/conf/tomcat-users.xml
sed -i '36 i\ <role rolename="manager-gui"/>' /home/vagrant/apache-tomcat-7.0.54/conf/tomcat-users.xml

./apache-tomcat-7.0.54/bin/startup.sh
