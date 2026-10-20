# LUXE Clothing Store

A separate full-stack clothing-store project. The storefront lives in `frontend/` and the Spring Boot REST API lives in `backend/`.

## Start the storefront

```bash
cd frontend
npm install
npm run dev
```

## Deploy the storefront to Vercel

Import the repository in Vercel from its root. The included `vercel.json` installs dependencies from `frontend/`, runs the Vite build there, and publishes `frontend/dist`.

Vercel hosts the React storefront only. Deploy the Spring Boot API separately and set `VITE_API_URL` in Vercel to that public API URL before redeploying.

## Start the API

Configure MySQL credentials in `backend/src/main/resources/application.yml`, then run:

```bash
cd backend
mvn spring-boot:run
```

The API is served under `/api/v1`.
