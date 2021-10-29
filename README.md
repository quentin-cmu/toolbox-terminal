# toolbox-terminal

DockerImages URL:
1. Apache Hadoop
   namenode: https://hub.docker.com/r/bde2020/hadoop-namenode
   datanode: https://hub.docker.com/r/bde2020/hadoop-datanode
2. Apache Spark
   https://hub.docker.com/r/bitnami/spark 
3. Jupyter Notebook
   https://hub.docker.com/r/jupyter/datascience-notebook
4. SonarQube and SonarScanner
   https://hub.docker.com/_/sonarqube
5. Java Terminal
   https://hub.docker.com/r/quentincmu/toolbox-terminal

Steps to Run the Terminal on GCP:

kubectl create deployment toolbox-terminal --image=gcr.io/cloudproject-14848/quentincmu/toolbox-terminal:latest
kubectl scale deployment toolbox-terminal --replicas=2
kubectl expose deployment toolbox-terminal --name=toolbox-terminal-service --type=LoadBalancer --port 80 --target-port 8080
