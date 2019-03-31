import React from 'react';
import SearchBar from "../components/searchHOC";
import './search-page.css'
import RecipeReviewCard from "../components/card";
import Grid from '@material-ui/core/Grid';
import {
    FAB_TYPE_FILTER,
    IMAGE_RECIPES_1,
    IMAGE_RECIPES_2,
    IMAGE_RECIPES_3,
    IMAGE_RECIPES_4,
    IMAGE_RECIPES_5
} from "../components/images";
import Typography from "@material-ui/core/Typography";
import {withStyles} from '@material-ui/core/styles';
import ChevronLeftIcon from '@material-ui/icons/ChevronLeft';
import ChevronRightIcon from '@material-ui/icons/ChevronRight';
import IconButton from "@material-ui/core/IconButton";
import Divider from "@material-ui/core/Divider";
import CustomFab from "../components/customFAB";
import Chip from "@material-ui/core/Chip";
import FilterHOC from "../components/filterHOC";

const styles = theme => ({
    root: {
        flexGrow: 1,
        alignItems: 'center'
    },
    paper: {
        padding: theme.spacing.unit * 2,
        textAlign: 'center',
        color: theme.palette.text.secondary,
    },
    chip: {
        margin: theme.spacing.unit,
    },
});


class SearchPage extends React.Component {
    state = {
        open: false,
    };

    toggleDrawerOpen = () => {
        this.setState({open: !this.state.open});
    };

    handleDrawerClose = () => {
        this.setState({open: false});
    };

    handleDelete = () => {
        alert('You clicked the delete icon.');
    };

    render() {
        const {classes} = this.props;
        return (
            <div className="search-page">
                <div style={{marginTop: '1rem'}}/>
                <SearchBar
                    style={{width: '100%'}}
                />
                <div style={{margin: '1rem 0'}}>
                    <Chip
                        label="Ντομάτα"
                        onDelete={this.handleDelete}
                        className={classes.chip}
                        color="primary"
                    />
                    <Chip
                        label="Λαχανικά"
                        onDelete={this.handleDelete}
                        className={classes.chip}
                        color="primary"
                    />
                    <Chip
                        label="Φρούτα"
                        onDelete={this.handleDelete}
                        className={classes.chip}
                        color="primary"
                    />
                    <Chip
                        label="Ελληνική"
                        onDelete={this.handleDelete}
                        className={classes.chip}
                        color="secondary"
                    />
                </div>
                <div className={classes.root}>
                    <Grid container spacing={16}>
                        <Grid item xs={12}>
                            <Typography variant="h4">
                                Κορυφαίες προτάσεις
                            </Typography>
                        </Grid>
                        <Grid className="card-top" item xs={12} sm={6}>
                            <RecipeReviewCard
                                image={IMAGE_RECIPES_1}
                            />
                        </Grid>
                        <Grid className="card-top" item xs={12} sm={6}>
                            <RecipeReviewCard
                                image={IMAGE_RECIPES_2}
                            />
                        </Grid>
                        <Grid item xs={12}>
                            <Typography variant="h4">
                                Παρόμοιες συνταγές
                            </Typography>
                        </Grid>
                        <Grid className="card-top" item xs={12} sm={4}>
                            <RecipeReviewCard
                                image={IMAGE_RECIPES_3}
                            />
                        </Grid>
                        <Grid className="card-top" item xs={12} sm={4}>
                            <RecipeReviewCard
                                image={IMAGE_RECIPES_4}
                            />
                        </Grid>
                        <Grid className="card-top" item xs={12} sm={4}>
                            <RecipeReviewCard
                                image={IMAGE_RECIPES_5}
                            />
                        </Grid>
                    </Grid>
                    <div style={{marginTop: '2rem'}}/>
                    <Divider variant="fullWidth"/>
                    <div
                    >
                        <IconButton>
                            <ChevronLeftIcon/>
                        </IconButton>
                        <IconButton>
                            <ChevronRightIcon/>
                        </IconButton>

                    </div>
                    <CustomFab onClick={this.toggleDrawerOpen} type={FAB_TYPE_FILTER}/>
                </div>

                <div style={{marginBottom: '4rem'}}/>
                <FilterHOC
                    open={this.state.open}
                    handleDrawerClose={this.handleDrawerClose}
                />
            </div>
        )
    }

}

export default withStyles(styles)(SearchPage);