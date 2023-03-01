/*
 * package io.zeebe.sworkflow.jobWorker;
 * 
 * import java.time.Duration;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Component;
 * 
 * import io.camunda.zeebe.client.ZeebeClient; import
 * io.camunda.zeebe.client.ZeebeClientBuilder; import
 * io.camunda.zeebe.client.api.response.ActivatedJob; import
 * io.camunda.zeebe.client.api.worker.JobWorker; import
 * io.camunda.zeebe.spring.client.annotation.ZeebeWorker;
 * 
 * @Component public class PaymentVerification {
 * 
 * // ZeebeClientBuilder clientBuilder;
 * 
 * @ZeebeWorker(type = "verify-transaction", name = "verify-transaction") public
 * void createJobworker() {
 * 
 * ZeebeClient client = createZeebeClient();
 * 
 * System.out.println("Opening job worker.");
 * 
 * try (final JobWorker workerRegistration =
 * client.newWorker().jobType("verify-transaction").handler(new
 * ExampleJobHandler()) .timeout(Duration.ofSeconds(10)).open()) {
 * System.out.println("Job worker opened and receiving jobs.");
 * 
 * } }
 * 
 * private static ZeebeClient createZeebeClient() {
 * 
 * return ZeebeClient.newClientBuilder().build();
 * 
 * }
 * 
 * @ZeebeWorker( type = "processing", autoComplete = true) public void
 * handleTweet() throws Exception {
 * System.out.println("AUTOMATIC PROCESSING HAPPENING"); }
 * 
 * System.out.println("AUTOMATIC PROCESSING HAPPENING");
 * 
 * } }
 */