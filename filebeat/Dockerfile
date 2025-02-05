FROM docker.elastic.co/beats/filebeat:8.16.3

USER root

# Filebeat config dosyasını konteyner içine kopyala
COPY filebeat.yml /usr/share/filebeat/filebeat.yml

# Dosya izinlerini yalnızca sahibine yazılabilir yap
RUN chmod 644 /usr/share/filebeat/filebeat.yml

# Filebeat'i başlatma komutu
CMD ["filebeat", "-e", "-c", "/usr/share/filebeat/filebeat.yml"]
