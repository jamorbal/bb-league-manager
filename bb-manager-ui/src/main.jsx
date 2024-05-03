import React from 'react';
import ReactDOM from 'react-dom/client';
import {Login} from './components/login/login';
import { GoogleOAuthProvider } from '@react-oauth/google';
import 'bootstrap/dist/css/bootstrap.min.css';
import './main.css';

ReactDOM.createRoot(document.getElementById('root')).render(
  <GoogleOAuthProvider clientId='1008186136889-fravoip8f2lhnrmn1n4utujpcdt3pq3q.apps.googleusercontent.com'>
    <React.StrictMode>
      <Login />
    </React.StrictMode>
  </GoogleOAuthProvider>
  ) 
