import React, {Component} from 'react';
import './logo.css'
import Link from "react-router-dom/es/Link";

export const LogoBlack = () => {
    return (
        <div className="logo">
            <Link to="">
                <img src={require("../../assets/logo_black.png")}/>
            </Link>
        </div>
    )
};