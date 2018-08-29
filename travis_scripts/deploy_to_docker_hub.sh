echo "Pushing service docker images to docker hub ...."
docker login -u $DOCKER_USERNAME -p $DOCKER_PASSWORD
docker push manishasansol/tmx-licensing-service:$BUILD_NAME
docker push manishasansol/tmx-organization-service:$BUILD_NAME
docker push manishasansol/tmx-eurekasvr:$BUILD_NAME
docker push manishasansol/tmx-zuulsvr:$BUILD_NAME
