# 🌱 Green and Tasty - Cloud-Native Restaurant Platform

A highly scalable, cloud-native restaurant reservation and management system built with microservices architecture. Designed to handle real-time operations like table reservations, menu viewing, waiter assignments, and user feedback — the project has grown from a monolithic AWS Lambda-based setup into a fully containerized Kubernetes deployment.

---

## 🚀 Tech Stack

**Backend:** Java, Spring Boot, Dagger  
**Frontend:** React.js (hosted on S3)  
**Database:** DynamoDB → Migrated to MongoDB  
**Authentication:** Cognito → Migrated to Spring Security with JWT  
**Cloud Services:** AWS Lambda, API Gateway, SES, SQS, CloudWatch  
**Deployment:** Kubernetes, ArgoCD, KubeRocketCI  
**Routing & Load Balancing:** Kubernetes Ingress  
**Email Reporting:** AWS SES, Scheduled with Spring `@Scheduled` and cron  
**CI/CD:** GitLab, KubeRocketCI, ArgoCD (GitOps)

---

## 🧠 Architecture Overview

Initially built with AWS Lambda for cost-efficiency, the system is now undergoing a migration to Kubernetes, where each service — including the core backend and reporting service — runs inside its own pod. Ingress is used for internal routing and load balancing across microservices.

ArgoCD enables GitOps-based deployment, and KubeRocketCI handles container image builds and promotions. The backend is fully modularized, with dedicated services for user management, reservations, feedback, and reporting.

---

## 🔑 Key Features

- 🔐 **Spring Security-based authentication**, replacing AWS Cognito
- 🍽️ **Dynamic table booking** with waiter-level visibility
- 👥 **Role-based access control** for customers, waiters, and admins
- 📨 **Automated report mailing** to managers via AWS SES using scheduled cron jobs
  - Generates CSV from reports table
  - Sends over email using SES
- 🧾 **Feedback management system** – post, retrieve, and sort by rating/date
- 🧠 **Microservice architecture** – feedback, booking, menu, reporting etc.
- 📋 **Menu browsing & filtering** per restaurant location
- ⚖️ **Workload-based waiter assignment** algorithm for efficiency
- 🌐 **Ingress-based routing & service exposure in Kubernetes**

---

## ⚙️ System Evolution

- ✅ Migrated from **DynamoDB to MongoDB** for flexible schema support
- ✅ Migrated **authentication** from AWS Cognito to in-house **Spring Security** with token-based auth
- ✅ Moved from Lambda-based monolith to **Kubernetes microservices**
- ✅ Introduced **ArgoCD** and **KubeRocketCI** for GitOps-based CI/CD
- ✅ Deployed services using **Ingress** for intelligent routing & load balancing

---

## 🛠️ How to Run (Coming Soon)

A Helm chart & deployment guide will be provided for spinning up the full Kubernetes stack locally using Minikube or on any cloud-native cluster.

---

## 📬 Contact

Created and maintained by **Chintamani Chourase**  
📧 chintamanichourase@gmail.com  
🌐 [LinkedIn](https://www.linkedin.com/in/chintamani-chourase-43964122b/)  
🧠 Always open to collaboration and contributions!

---

## 🏁 Status

✅ Actively maintained and expanding  
🔜 More microservices (payment, analytics, queue system) under development  
📊 Enhanced observability and Prometheus/Grafana integration coming soon

---

