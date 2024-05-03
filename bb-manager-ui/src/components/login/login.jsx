import React from 'react';
import { GoogleLogin } from '@react-oauth/google';
import Card from 'react-bootstrap/Card';
import './login.css'

export function Login() {
    const responseMessage = (response) => {
        console.log(response);
    };
    const errorMessage = (error) => {
        console.log(error);
    };
    return (
        <Card>
        <Card.Img variant="top" src="bloodbowl_logo.png"/>
        <Card.Body>
          <Card.Title>League Manager</Card.Title>
          <div className="blur-rule"></div>
          <Card.Text>Sign in to access</Card.Text>
          <GoogleLogin onSuccess={responseMessage} onError={errorMessage} logo_alignment='center' width='260' shape='pill'/>
        </Card.Body>
      </Card>

    );
}
