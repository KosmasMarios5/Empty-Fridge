import React from 'react';
import './fab.css';
import { withStyles } from '@material-ui/core/styles';
import Fab from '@material-ui/core/Fab';
import AddIcon from '@material-ui/icons/Add';
import EditIcon from '@material-ui/icons/Edit';
import FilterListIcon from '@material-ui/icons/FilterList';
import green from '@material-ui/core/colors/green';
import {FAB_TYPE_ADD, FAB_TYPE_EDIT, FAB_TYPE_FILTER} from "./images";

const styles = theme => ({
    root: {
        backgroundColor: theme.palette.background.paper,
        width: 500,
        position: 'relative',
        minHeight: 200,
    },
    fab: {
        position: 'fixed',
        bottom: theme.spacing.unit * 4,
        right: theme.spacing.unit * 4,
    },
    fabGreen: {
        color: theme.palette.common.white,
        backgroundColor: green[500],
        '&:hover': {
            backgroundColor: green[600],
        },
    },
});


class CustomFab extends React.Component {

    render() {
        const { classes, theme } = this.props;

        const fabs = [
            {
                type: FAB_TYPE_ADD,
                color: 'primary',
                className: classes.fab,
                icon: <AddIcon />,
            },
            {
                type: FAB_TYPE_EDIT,
                color: 'secondary',
                className: classes.fab,
                icon: <EditIcon />,
            },
            {
                type: FAB_TYPE_FILTER,
                color: 'secondary',
                className: classes.fab,
                icon: <FilterListIcon />,
            },
        ];
        const fab = fabs.find(fab => fab.type === this.props.type);
        return fab ? (
            <Fab onClick={this.props.onClick} className={fab.className} color={fab.color}>
                {fab.icon}
            </Fab>
        ) : null;
    }
}

export default  withStyles(styles, { withTheme: true })(CustomFab);