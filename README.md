 Step 11: Test With Postman
Method: POST

URL: http://localhost:8080/api/kafka/publish

Body → raw → JSON:

json
Copy
Edit
{
  "message": "Hello Kafka from Docker!"
}
Header:

Content-Type: application/json

You should see "Message sent to Kafka topic" in response.
