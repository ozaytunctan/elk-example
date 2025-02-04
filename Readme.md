#docker composu up ile çalıştırmak için
docker-compose --env-file .env up -d --build

#Reset password
docker exec -it elasticsearch bin/elasticsearch-reset-password -u elastic -i
"# elk-example" 
