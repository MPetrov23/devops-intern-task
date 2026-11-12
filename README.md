# Intern Challenge — Spring Boot App

A simple REST API that returns a greeting message. This repository is the starting
point for the DevOps intern assessment task.

## Before you start — create your SAP BTP Trial account

You will need a free **SAP BTP Trial** account to deploy the application. Follow the
official SAP Discovery Center guide:
**<https://discovery-center.cloud.sap/card/58250857-1c8e-440f-800a-a264969a3bc8>**

## Endpoint

`GET /hello` → returns a greeting message.

## Requirements

- Java 21
- Maven 3.8+
- GitHub account
- SAP BTP Trial account
- Cloud Foundry CLI (`cf`)

## Your task

1. **Fork** this repository to your own GitHub account.
2. Get the application **running locally**.
3. Set up a **GitHub Actions CI/CD pipeline** (see the *CI/CD Pipeline* section below).
4. **Deploy** the application to SAP BTP (Cloud Foundry).
5. As you work, **keep the README accurate** — by the end of the day it should be
   complete enough that a new team member could follow it and run the app themselves.

## Deployment

The application can be deployed to SAP BTP using `cf push`.

## CI/CD Pipeline

This repository already contains a GitHub Actions workflow at
`.github/workflows/ci.yml`.

1. **Fix the existing workflow** so that, on every push to the main branch, it builds
   the application, runs the tests, and produces the deployable artifact. Confirm you
   get a green run in the **Actions** tab of your fork.
2. **Add a stage that scans the project's dependencies for known security
   vulnerabilities** and publishes the result.
3. **Add a stage that deploys the application to SAP BTP.** Think about *when* this
   stage should run — deploying on every single commit may not be what you want.

---

> **Note:** This README is intentionally incomplete. Part of your task is to research
> the missing steps (how to build, the exact Cloud Foundry commands, how to log in to
> BTP, what the deployed URL looks like) and to fix anything you find that is wrong.
> Use official documentation and web search — please do not use AI tools.
