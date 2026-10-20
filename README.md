# LUXE Clothing Store

A separate full-stack clothing-store project. The storefront lives in `frontend/` and the Spring Boot REST API lives in `backend/`.

## Start the storefront

```bash
cd frontend
npm install
npm run dev
```

## Start the API

Configure MySQL credentials in `backend/src/main/resources/application.yml`, then run:

```bash
cd backend
mvn spring-boot:run
```

The API is served under `/api/v1`.
