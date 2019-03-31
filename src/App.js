import React, {Component} from 'react';
import './App.css';
import {MuiThemeProvider, createMuiTheme} from '@material-ui/core/styles';
import {deepOrange, orange} from "@material-ui/core/colors";
import LayoutHOC from "./components/layoutHOC";
import ContentRouter from "./routers/contentRouter";
import HashRouter from "react-router-dom/es/HashRouter";

const theme = createMuiTheme({
    palette: {
        primary: {main: orange[300]},
        secondary: {main: deepOrange[600]},
    },
    typography: {useNextVariants: true},
});

class App extends Component {
    render() {
        return (
            <HashRouter >
                <MuiThemeProvider theme={theme}>
                    <LayoutHOC>
                        <ContentRouter />
                    </LayoutHOC>
                </MuiThemeProvider>
            </HashRouter>
        );
    }
}

export default App;
