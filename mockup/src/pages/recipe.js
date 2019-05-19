import React from 'react';
import SearchBar from "../components/searchHOC";
import './recipe.css'
import RecipeReviewCard, {EditorConvertToHTML} from "../components/card";
import Grid from '@material-ui/core/Grid';
import {
    FAB_TYPE_FILTER, IMAGE_CHEF, IMAGE_CHEF_2, IMAGE_OVERVIEW,
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
import CategoryIcon from '@material-ui/icons/Category';
import IconButton from "@material-ui/core/IconButton";
import Divider from "@material-ui/core/Divider";
import CustomFab from "../components/customFAB";
import Chip from "@material-ui/core/Chip";
import Avatar from "@material-ui/core/Avatar";
import FilterHOC from "../components/filterHOC";
import {Swiper, Slide} from 'react-dynamic-swiper'
import 'react-dynamic-swiper/lib/styles.css'
import CardHeader from "@material-ui/core/CardHeader";
import MoreVertIcon from '@material-ui/icons/MoreVert';

import FavoriteIcon from '@material-ui/icons/Favorite';
import ShareIcon from '@material-ui/icons/Share';
import CardActions from "@material-ui/core/CardActions";
import Paper from "@material-ui/core/Paper";
import Card from "@material-ui/core/Card";
import CardContent from "@material-ui/core/CardContent";

import ShoppingBasketIcon from '@material-ui/icons/ShoppingBasket';
import CardMedia from "@material-ui/core/CardMedia";
import RecipeCardSmall from "../components/cardSmall";
import Button from "@material-ui/core/Button";

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
    bigAvatar: {
        margin: 10,
        width: 60,
        height: 60,
    }, avatar: {
        margin: 10,
    },
    card: {

        display: 'flex',
    },

    details: {
        flex: '0 0 180px',
        display: 'flex',
        flexDirection: 'column',
        textAlign: 'center'
    },
    content: {
        flex: '1 0 auto',
    },
    cover: {
        width: 151,
    },
    controls: {
        display: 'flex',
        alignItems: 'center',
        paddingLeft: theme.spacing.unit,
        paddingBottom: theme.spacing.unit,
    },
});


class RecipePage extends React.Component {
    state = {
        open: false,
    };


    toggleDrawerOpen = () => {
        this.setState({open: !this.state.open});
    };

    handleDrawerOpen = () => {
        this.setState({open: true});
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
            <div className="recipe-page">
                <Typography variant="h3" gutterBottom>
                    Stake
                </Typography>
                <Grid container spacing={24}>
                    <Grid item xs={12} sm={6}>

                        <CardHeader
                            avatar={
                                <Avatar alt="Remy Sharp" src={IMAGE_CHEF}/>
                            }
                            action={
                                <table>
                                    <tbody>
                                    <tr>
                                        <td style={{paddingRight: '1rem'}}>Βαθμολογία</td>
                                        <td>5/5</td>
                                    </tr>
                                    <tr>
                                        <td>Δυσκολία</td>
                                        <td>2/5</td>
                                    </tr>
                                    </tbody>
                                </table>
                            }
                            title={"Από τον John Doe"}
                            subheader="September 19, 2018"
                        />
                        <CardActions>
                            <IconButton aria-label="Add to shopping list">
                                <ShoppingBasketIcon/>
                            </IconButton>
                            <IconButton aria-label="Add to favorites">
                                <FavoriteIcon/>
                            </IconButton>
                            <IconButton aria-label="Share">
                                <ShareIcon/>
                            </IconButton>
                            <Button variant="contained" color="secondary" className={classes.button} style={{marginLeft: 'auto', textTransform: 'initial'}}>
                                Το έφτιαξα!
                            </Button>
                        </CardActions>
                        <div style={{marginBottom: '2rem'}}/>
                        <Typography variant="p" gutterBottom>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Deserunt illum laboriosam magnam,
                            quod reiciendis similique unde. Ad atque consequuntur distinctio eos fuga incidunt,
                            molestias natus quibusdam quo reiciendis, rem voluptatum?
                        </Typography>
                        <div style={{marginBottom: '1rem'}}/>
                        <Typography variant="p" gutterBottom>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Deserunt illum laboriosam magnam,
                            quod reiciendis similique unde. Ad atque consequuntur distinctio eos fuga incidunt,
                            molestias natus quibusdam quo reiciendis, rem voluptatum?
                        </Typography>
                    </Grid>
                    <Grid item xs={12} sm={6}>
                        <div className="slider-parent">
                            <img src={IMAGE_OVERVIEW} alt=""/>
                            <div className="slider slider-left">
                                <IconButton color="secondary">
                                    <ChevronLeftIcon/>
                                </IconButton>

                            </div>
                            <div className="slider slider-right">
                                <IconButton color="secondary">
                                    <ChevronRightIcon/>
                                </IconButton>
                            </div>
                        </div>
                    </Grid>
                    <Grid item xs={12} sm={6}>
                        <Typography variant="h5" gutterBottom>
                            Υλικά
                        </Typography>
                        <ul>
                            <li>½ φλιτζ. ηλιόσποροι ή καρύδια ή κάσιους μουλιασμένα για 2-4 ώρες</li>
                            <li>½ φλιτζ. λιαστές ντομάτες σε λάδι</li>
                            <li>1 ½ φλιτζ. μπαγιάτικο ψωμί ζυμωτό, χωρίς την κόρα</li>
                            <li>½ φλιτζ. ελαιόλαδο</li>
                            <li>4 κ.σ. λινέλαιο</li>
                            <li>½ φλιτζ. χυμό λεμονιού</li>
                            <li>3 κ.σ. μηλόξιδο</li>
                            <li>2 φύλλα (περίπου 2 κ.σ. κομματιασμένα) βρώσιμα φύκια ξερά (όπως nori)</li>
                            <li>½ -1 κ.γ. αλάτι (ανάλογα με το πόσο αλμυρές είναι οι ντομάτες μας)</li>
                            <li>φρεσκοτριμμένο πιπέρι</li>
                        </ul>
                    </Grid>
                    <Grid item xs={12} sm={6}>
                        <Typography variant="h5" gutterBottom>
                            Εκτέλεση
                        </Typography>
                        <ol>
                            <li>Σε ένα μπολ βάζουμε τα φύκια μαζί με ένα φλιτζάνι ζεστό νερό και τα αφήνουμε για 10-15
                                λεπτά να ενυδατωθούν.
                            </li>
                            <li>Αφού στραγγίξουμε τα φύκια κρατάμε το νεράκι με το οποίο τα μουλιάσαμε και βρέχουμε με
                                αυτό την ψίχα του ψωμιού. Το αφήνουμε σε ένα μπολάκι για 5 λεπτά να μουσκέψει. Στη
                                συνέχεια το στραγγίζουμε και το βάζουμε στην άκρη.
                            </li>
                            <li>Σουρώνουμε τους ξηρούς καρπούς και τους χτυπάμε στο μούλτι ή σε ένα δυνατό μπλέντερ ή
                                πολυκόφτη μαζί με το ελαιόλαδο και το χυμό του λεμονιού για 2-3 λεπτά ώσπου να
                                πολτοποιηθούν.
                            </li>
                            <li>Προσθέτουμε τις λιαστές ντομάτες και τα φύκια και συνεχίζουμε το χτύπημα για 2 λεπτά
                                ακόμα, μέχρι να έχουμε ένα ομοιογενές μείγμα. Τέλος προσθέτουμε το ψωμί, το λινέλαιο και
                                το μηλόξιδο κουταλιά-κουταλιά, δοκιμάζοντας τη γεύση κάθε φορά. Δοκιμάζουμε στο αλάτι,
                                το λεμόνι και το πιπέρι και διορθώνουμε αν χρειαστεί. Οι δικές μου λιαστές ντομάτες ήταν
                                ανάλατες και πρόσθεσα περίπου 1 κ.γ. (ή και λίγο παραπάνω) αλάτι ώστε να είναι αρκετά
                                αλμυρή. Επειδή όμως οι περισσότερες λιαστές της αγοράς είναι πολύ αλμυρές, θα πρότεινα
                                μια δοκιμή πριν προστεθεί επιπλέον αλάτι. Άλλωστε τα γούστα του καθενός είναι
                                διαφορετικά!
                            </li>
                        </ol>
                    </Grid>

                    <Typography style={{padding: '0 8px' }} variant="h5" gutterBottom>
                        Παρόμοιες συνταγές
                    </Typography>
                    <Grid container spacing={8} item xs={12}>

                        <Grid item xs={6} sm={4}>
                            <RecipeCardSmall image={IMAGE_RECIPES_4}/>
                        </Grid>
                        <Grid item xs={6} sm={4}>
                            <RecipeCardSmall image={IMAGE_RECIPES_5}/>
                        </Grid>
                        <Grid item xs={6} sm={4}>
                            <RecipeCardSmall image={IMAGE_RECIPES_1}/>
                        </Grid>


                    </Grid>
                </Grid>

                <div style={{marginBottom: '4rem'}}/>

                <Typography variant="h5" gutterBottom>
                    Σχόλια
                </Typography>

                <div style={{marginBottom: '1rem'}}/>
                <div className="comments">
                    <Paper className={classes.root} elevation={0}>
                        <Card className={classes.card}>
                            <CardHeader
                                className={classes.details}
                                avatar={
                                    <Avatar alt="Remy Sharp" src={IMAGE_CHEF} className={classes.avatar}/>

                                }
                                title="Shrimp and Chorizo Paella"
                            />
                            <CardContent>
                                <Typography component="p">
                                    Posted at: September 14, 2016
                                </Typography>
                                <Divider/>
                                <div style={{marginBottom: '1rem'}}/>
                                <Typography component="p">
                                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dignissimos, inventore,
                                    quia! Alias consectetur consequatur deleniti nemo quidem reiciendis veritatis
                                    voluptas? Eius error ex reiciendis sapiente veniam? Aut nostrum quibusdam ullam!
                                </Typography>
                            </CardContent>
                            <CardActions className={classes.actions} disableActionSpacing>
                                <IconButton aria-label="Add to favorites">
                                    <FavoriteIcon/>
                                </IconButton>
                            </CardActions>
                        </Card>
                    </Paper>
                    <div style={{marginBottom: '1rem'}}/>
                    <Paper className={classes.root} elevation={0}>
                        <Card className={classes.card}>
                            <CardHeader
                                className={classes.details}
                                avatar={
                                    <Avatar alt="Remy Sharp" src={IMAGE_CHEF_2} className={classes.avatar}/>

                                }
                                title="Shrimp and Chorizo Paella"
                            />
                            <CardContent>
                                <Typography component="p">
                                    Posted at: September 14, 2016
                                </Typography>
                                <Divider/>
                                <div style={{marginBottom: '1rem'}}/>
                                <Typography component="p">
                                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ad blanditiis culpa
                                    delectus enim eveniet, explicabo fugit inventore, iste itaque maxime necessitatibus
                                    nisi odio optio pariatur, placeat quia quidem sed sint?
                                </Typography>
                            </CardContent>
                            <CardActions className={classes.actions} disableActionSpacing>
                                <IconButton aria-label="Add to favorites">
                                    <FavoriteIcon/>
                                </IconButton>
                            </CardActions>
                        </Card>
                    </Paper>
                    <div style={{marginBottom: '1rem'}}/>
                    <Paper className={classes.root} elevation={0}>
                        <Card className={classes.card}>
                            <CardHeader
                                className={classes.details}
                                avatar={
                                    <Avatar alt="Remy Sharp" src={IMAGE_CHEF} className={classes.avatar}/>

                                }
                                title="Shrimp and Chorizo Paella"
                            />
                            <CardContent>
                                <Typography component="p">
                                    Posted at: September 14, 2016
                                </Typography>
                                <Divider/>
                                <div style={{marginBottom: '1rem'}}/>
                                <Typography component="p">
                                    This impressive paella is a perfect party dish and a fun meal to cook together with
                                    your
                                    guests. Add 1 cup of frozen peas along with the mussels, if you like.
                                </Typography>
                            </CardContent>
                            <CardActions className={classes.actions} disableActionSpacing>
                                <IconButton aria-label="Add to favorites">
                                    <FavoriteIcon/>
                                </IconButton>
                            </CardActions>
                        </Card>
                    </Paper>
                    <div style={{marginBottom: '1rem'}}/>
                    <Paper className={classes.root} elevation={0}>
                        <Card className={classes.card}>
                            <CardHeader
                                className={classes.details}
                                avatar={
                                    <Avatar alt="Remy Sharp" src={IMAGE_CHEF} className={classes.avatar}/>

                                }
                                title="Shrimp and Chorizo Paella"
                            />
                            <CardContent>
                                <Typography component="p">
                                    Posted at: September 14, 2016
                                </Typography>
                                <Divider/>
                                <div style={{marginBottom: '1rem'}}/>
                                <Typography component="p">
                                    This impressive paella is a perfect party dish and a fun meal to cook together with
                                    your
                                    guests. Add 1 cup of frozen peas along with the mussels, if you like.
                                </Typography>
                            </CardContent>
                            <CardActions className={classes.actions} disableActionSpacing>
                                <IconButton aria-label="Add to favorites">
                                    <FavoriteIcon/>
                                </IconButton>
                            </CardActions>
                        </Card>
                    </Paper>
                    <div
                        // style={{textAlign: 'right'}}
                    >
                        <IconButton>
                            <ChevronLeftIcon/>
                        </IconButton>
                        <IconButton>
                            <ChevronRightIcon/>
                        </IconButton>

                    </div>
                    <div style={{marginBottom: '1rem'}}/>

                    <Typography variant="h5" gutterBottom>
                        Γράψε το σχόλιο σου
                    </Typography>
                    <div style={{marginBottom: '1rem'}}/>
                    <EditorConvertToHTML />
                </div>
            </div>
        )
    }

}

export default withStyles(styles)(RecipePage);