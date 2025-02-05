#docker composu up ile çalıştırmak için
docker-compose --env-file .env up -d --build

#Reset password
docker exec -it elasticsearch bin/elasticsearch-reset-password -u elastic -i
"# elk-example"

docker exec -it accounting-api ping logstash

### Filebeat Konfigürasyon Dosyasının İzinlerini Düzenleme
   filebeat.yml dosyasını bulunduğunuz dizinde filebeat klasörüne yerleştirin.
   Windows ortamında, filebeat.yml dosyasının sadece okunabilir (read-only) olmasını sağlamak için, dosyayı sağ
   tıklayıp "Properties" sekmesinden "Read-only" kutusunu işaretleyin. Bu işlem, Windows'ta dosyanın sadece okunabilir
   olmasını sağlar.

