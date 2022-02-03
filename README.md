## spring-boot-customer-k8s

docker build --tag=spring-boot-customer-k8s:latest .


http://localhost:8080/customers/1

kubectl apply -f workloads.yml
kubectl apply -f services.yml

kubectl get all

kubectl -it exec posgres-db-77fbf5768c-7lwjv  -- sh

psql -h localhost -U postgres --password -p 30001 postgres

kubectl port-forward kafka-deploy-54666dbbf-5w5jf  30092
