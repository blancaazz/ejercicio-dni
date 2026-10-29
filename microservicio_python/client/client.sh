curl -X 'POST' 'http://127.0.0.1:8000/dni/12345678' -H 'accept: */*' -d ''
echo ''
curl -X 'GET' 'http://127.0.0.1:8000/dni/validar?dni=12345678L' -H 'accept: */*'
echo ''
read -p "Press key to continue.. " -n1 -s