
###  Create deployment - no config file (use defaults)
```kubectl create deployment --image registry.digitalocean.com/home-images/demo-servlet:latest demo-servlet```

### Create Deployment from file
```kubectl create -f kube-manifests/deploy.yaml```

### Create LoadBalancer Service to expose pods
```kubectl create -f kube-manifests/service.yaml```

### Query
```
kubctl get deploy(ments)
kubctl get pods
kubctl get svc -o wide

kubectl get pods --show-labels
kubectl get pods -o wide
```
