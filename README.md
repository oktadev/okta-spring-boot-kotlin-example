# Manage Okta's Authentication API using Spring Boot and Kotlin

This example shows how to use Okta's Authentication API with Spring Boot, Kotlin as the main language.

Please read [Build an Application with Spring Boot and Kotlin](http://developer.okta.com/blog/2019/09/17/build-a-spring-boot-kotlin-app) to see how this app was created.

**Prerequisites:** [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

> [Okta](https://developer.okta.com/) has Authentication and User Management APIs that reduce development time with instant-on, scalable user infrastructure. Okta's intuitive API and expert support make it easy for developers to authenticate, manage and secure users and roles in any application.

* [Getting Started](#getting-started)
* [Help](#help)
* [Links](#links)
* [License](#license)

## Getting Started

To install this example application, run the following commands:

```bash
git clone https://github.com/oktadeveloper/okta-spring-boot-kotlin-example.git
```

This will get a copy of the project locally. 

To build the project, run the following command inside the project's folder:

```bash
./gradlew build
```

### Create an OIDC App in Okta

You will need to create an OIDC App in Okta to get a `clientId` and `clientSecret`. 

Log in to your Okta Developer account (or [sign up](https://developer.okta.com/signup/) if you don’t have an account) and navigate to **Applications** > **Add Application**. Click **Web**, click **Next**, and give the app a name you’ll remember. Click **Done** and copy the `clientId` into `server/src/main/resources/application.yml`. 

```yaml
okta:  
  oauth2:  
    issuer: https://{yourOktaDomain}/oauth2/default  
    client-id: {yourClientID}
    client-secret: {yourClientSecret}
```

**NOTE:** The value of `{yourOktaDomain}` should be something like `dev-123456.okta.com`. Make sure you don't include `-admin` in the value!

### Start the application

To start the application you can just run:

```bash
./gradlew bootRun
```

## Links

This example uses the following libraries provided by Okta:

This example uses the [Okta Spring Boot Starter](https://github.com/okta/okta-spring-boot) to integrate with Okta.

## Help

Please post any questions as comments on the following blog posts, or visit our [Okta Developer Forums](https://devforum.okta.com/). You can also email developers@okta.com if would like to create a support ticket.

## License

Apache 2.0, see [LICENSE](LICENSE).
