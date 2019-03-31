import React from 'react';
import {withStyles} from '@material-ui/core/styles';
import Paper from '@material-ui/core/Paper';
import InputBase from '@material-ui/core/InputBase';
import Divider from '@material-ui/core/Divider';
import IconButton from '@material-ui/core/IconButton';
import SearchIcon from '@material-ui/icons/Search';
import KeyboardVoiceIcon from '@material-ui/icons/KeyboardVoice';

const styles = {
    root: {
        padding: '2px 4px',
        display: 'flex',
        alignItems: 'center',
        width: 400,
    },
    input: {
        marginLeft: 8,
        flex: 1,
    },
    iconButton: {
        padding: 10,
    },
    divider: {
        width: 1,
        height: 28,
        margin: 4,
    },
};

function SearchBar(props) {
    const {classes, style} = props;
    return (
        <Paper style={style} className={classes.root} elevation={1}>
            <InputBase defaultValue={props.defaultValue} className={classes.input}
                       placeholder={props.placeholder ? props.placeholder : "Ψάξε συνταγές"}/>
            <IconButton className={classes.iconButton} aria-label="Search">
                <SearchIcon/>
            </IconButton>
            <Divider className={classes.divider}/>
            <IconButton color="primary" className={classes.iconButton} aria-label="Directions">
                <KeyboardVoiceIcon/>
            </IconButton>
        </Paper>
    );
}

export default withStyles(styles)(SearchBar);