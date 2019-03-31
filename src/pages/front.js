import React from 'react';
import {LogoBlack} from "../components/images/logo";
import SearchBar from "../components/searchHOC";
import { Link } from 'react-router-dom'

const FrontPage = (props) => {
    return (
        <div className="main-search">
            <LogoBlack/>
            <Link to="search">
            <SearchBar/>
            </Link>
        </div>
    );
};

export default FrontPage;