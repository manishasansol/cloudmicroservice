echo "Launching $BUILD_NAME IN AMAZON ECS"
ecs-cli configure profile --profile-name default --access-key $AWS_ACCESS_KEY --secret-key $AWS_SECRET_KEY
ecs-cli configure --region us-west-2 --cluster manish-asansol-microservice-demo
ecs-cli compose --file docker/common/docker-compose.yml up
rm -rf ~/.ecs
