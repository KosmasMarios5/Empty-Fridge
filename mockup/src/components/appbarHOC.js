import React, {Fragment} from 'react';
import AppBar from '@material-ui/core/AppBar';
import Toolbar from '@material-ui/core/Toolbar';
import IconButton from '@material-ui/core/IconButton';
import Typography from '@material-ui/core/Typography';
import InputBase from '@material-ui/core/InputBase';
import Badge from '@material-ui/core/Badge';
import MenuItem from '@material-ui/core/MenuItem';
import Menu from '@material-ui/core/Menu';
import {fade} from '@material-ui/core/styles/colorManipulator';
import MenuIcon from '@material-ui/icons/Menu';
import SearchIcon from '@material-ui/icons/Search';
import AccountCircle from '@material-ui/icons/AccountCircle';
import MailIcon from '@material-ui/icons/Mail';
import NotificationsIcon from '@material-ui/icons/Notifications';
import MoreIcon from '@material-ui/icons/MoreVert';
import {withStyles} from '@material-ui/core/styles';
import {LogoBlack} from "./images/logo";
import ShoppingBasketIcon from '@material-ui/icons/ShoppingBasket';
import Modal from "@material-ui/core/Modal";
import SearchBar from "./searchHOC";
import List from "@material-ui/core/List";
import ListItem from "@material-ui/core/ListItem";
import Checkbox from "@material-ui/core/Checkbox";
import ListItemText from "@material-ui/core/ListItemText";
import Button from "@material-ui/core/Button";
import Grid from "@material-ui/core/Grid";

const styles = theme => ({
    paper: {
        position: 'absolute',
        width: theme.spacing.unit * 58,
        backgroundColor: theme.palette.background.paper,
        boxShadow: theme.shadows[5],
        padding: theme.spacing.unit * 2,
        outline: 'none',
    },
    root: {
        width: '100%',
    },
    grow: {
        flexGrow: 1,
    },
    menuButton: {
        marginRight: 20,
    },
    title: {
        display: 'none',
        [theme.breakpoints.up('sm')]: {
            display: 'block',
        },
    },
    search: {
        position: 'relative',
        borderRadius: theme.shape.borderRadius,
        backgroundColor: fade(theme.palette.common.white, 0.15),
        '&:hover': {
            backgroundColor: fade(theme.palette.common.white, 0.25),
        },
        marginRight: theme.spacing.unit * 2,
        marginLeft: 0,
        width: '100%',
        [theme.breakpoints.up('sm')]: {
            marginLeft: theme.spacing.unit * 3,
            width: 'auto',
        },
    },
    searchIcon: {
        width: theme.spacing.unit * 9,
        height: '100%',
        position: 'absolute',
        pointerEvents: 'none',
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'center',
    },
    inputRoot: {
        color: 'inherit',
        width: '100%',
    },
    inputInput: {
        paddingTop: theme.spacing.unit,
        paddingRight: theme.spacing.unit,
        paddingBottom: theme.spacing.unit,
        paddingLeft: theme.spacing.unit * 10,
        transition: theme.transitions.create('width'),
        width: '100%',
        [theme.breakpoints.up('md')]: {
            width: 200,
        },
    },
    sectionDesktop: {
        display: 'none',
        [theme.breakpoints.up('md')]: {
            display: 'flex',
        },
    },
    sectionMobile: {
        display: 'flex',
        [theme.breakpoints.up('md')]: {
            display: 'none',
        },
    },
    checkbox: {
        padding: '0',
        // paddingLeft: 16
    },
    nested: {
        paddingLeft: 0,
        paddingTop: 0,
    },
});

function getModalStyle() {
    const top = 50;
    const left = 50;

    return {
        top: `${top}%`,
        left: `${left}%`,
        transform: `translate(-${top}%, -${left}%)`,
    };
}

class AppbarHOC extends React.Component {
    state = {
        open: false,
        anchorEl: null,
        mobileMoreAnchorEl: null,
    };
    handleOpen = () => {
        this.setState({open: true});
    };

    handleClose = () => {
        this.setState({open: false});
    };

    handleProfileMenuOpen = event => {
        this.setState({anchorEl: event.currentTarget});
    };

    handleMenuClose = () => {
        this.setState({anchorEl: null});
        this.handleMobileMenuClose();
    };

    handleMobileMenuClose = () => {
        this.setState({mobileMoreAnchorEl: null});
    };

    render() {
        const {anchorEl} = this.state;
        const isMenuOpen = Boolean(anchorEl);
        const {classes} = this.props;
        const renderMenu = (
            <Menu
                anchorEl={anchorEl}
                anchorOrigin={{vertical: 'top', horizontal: 'right'}}
                transformOrigin={{vertical: 'top', horizontal: 'right'}}
                open={isMenuOpen}
                onClose={this.handleMenuClose}
            >
                <MenuItem onClick={this.handleMenuClose}>Αγαπημένα</MenuItem>
                <MenuItem onClick={this.handleMenuClose}>Προφίλ</MenuItem>
            </Menu>
        );

        return (
            <Fragment>
                <AppBar
                    className={this.props.className}
                    position="fixed"
                >
                    <Toolbar>
                        <LogoBlack/>
                        <div className={classes.grow}/>
                        <div className={classes.sectionDesktop}>
                            <IconButton onClick={this.handleOpen} color="inherit">
                                <Badge badgeContent={4} color="secondary">
                                    <ShoppingBasketIcon/>
                                </Badge>
                            </IconButton>
                            <IconButton
                                aria-owns={isMenuOpen ? 'material-appbar' : undefined}
                                aria-haspopup="true"
                                onClick={this.handleProfileMenuOpen}
                                color="inherit"
                            >
                                <AccountCircle/>
                            </IconButton>
                        </div>
                        <IconButton
                            onClick={this.props.onBurgerClick}
                            style={{marginLeft: 12}}
                            className={classes.menuButton} color="inherit" aria-label="Open drawer">
                            <MenuIcon/>
                        </IconButton>

                    </Toolbar>
                    {renderMenu}
                </AppBar>
                <div>

                    <Modal
                        aria-labelledby="simple-modal-title"
                        aria-describedby="simple-modal-description"
                        open={this.state.open}
                        onClose={this.handleClose}
                    >
                        <div style={getModalStyle()} className={classes.paper}>
                            <Typography variant="h6" id="modal-title">
                                Shopping List
                            </Typography>
                            <div style={{marginBottom: '1rem'}}/>
                            <SearchBar placeholder="Ψάξε κάποιο υλικό"/>
                            <div style={{marginBottom: '1rem'}}/>
                            <Typography variant="subtitle1" id="simple-modal-description">

                                <Grid container spacing={24}>
                                    <Grid item xs={6}>
                                        <List style={{padding: 0}} disablePadding>
                                            <ListItem className={classes.nested}>
                                                <Checkbox
                                                    className={classes.checkbox}
                                                    value="checkedA"
                                                />
                                                <ListItemText inset primary="Μανιτάρια"/>
                                            </ListItem>
                                            <ListItem className={classes.nested}>
                                                <Checkbox
                                                    checked
                                                    className={classes.checkbox}
                                                    value="checkedA"
                                                /><ListItemText inset primary="Ντομάτα"/>
                                            </ListItem>
                                            <ListItem className={classes.nested}>
                                                <Checkbox
                                                    checked
                                                    className={classes.checkbox}
                                                /><ListItemText inset primary="Φρούτα"/>
                                            </ListItem>
                                            <ListItem className={classes.nested}>
                                                <Checkbox
                                                    className={classes.checkbox}
                                                    value="checkedA"
                                                />
                                                <ListItemText inset primary="Λαχανικά"/>
                                            </ListItem>
                                        </List>

                                    </Grid>
                                    <Grid item xs={6}>
                                        <List style={{padding: 0}} disablePadding>
                                            <ListItem className={classes.nested}>
                                                <Checkbox
                                                    className={classes.checkbox}
                                                    value="checkedA"
                                                />
                                                <ListItemText inset primary="Μανιτάρια"/>
                                            </ListItem>
                                            <ListItem className={classes.nested}>
                                                <Checkbox
                                                    checked
                                                    className={classes.checkbox}
                                                    value="checkedA"
                                                /><ListItemText inset primary="Ντομάτα"/>
                                            </ListItem>
                                            <ListItem className={classes.nested}>
                                                <Checkbox
                                                    className={classes.checkbox}
                                                /><ListItemText inset primary="Φρούτα"/>
                                            </ListItem>
                                            <ListItem className={classes.nested}>
                                                <Checkbox
                                                    className={classes.checkbox}
                                                    checked
                                                    value="checkedA"
                                                />
                                                <ListItemText inset primary="Λαχανικά"/>
                                            </ListItem>
                                        </List>
                                    </Grid>
                                </Grid>
                            </Typography>
                            <div style={{marginBottom: '1rem'}}/>
                            <div style={{marginBottom: '1rem'}}/>
                            <Button
                                onClick={this.handleClose}
                                style={{marginRight: 8}} color="primary" className={classes.button}>
                                Αποθηκευση
                            </Button>
                            <Button
                                onClick={this.handleClose}
                                className={classes.button}
                            >
                                Ακυρο
                            </Button>
                        </div>
                    </Modal>
                </div>
            </Fragment>
        )
    }

}

export default withStyles(styles)(AppbarHOC);