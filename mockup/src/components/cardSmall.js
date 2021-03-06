import React from "react";
import PropTypes from 'prop-types';
import { withStyles } from '@material-ui/core/styles';
import Card from '@material-ui/core/Card';
import CardActionArea from '@material-ui/core/CardActionArea';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import CardMedia from '@material-ui/core/CardMedia';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';

const styles = {
    card: {
        maxWidth: '100%',
    },
    media: {
        maxHeight: 140,
        objectFit: 'cover',
    },
};

class  RecipeCardSmall  extends React.Component{
    render(){

        const {classes, image} = this.props;

        return(
            <Card className={classes.card}>
                <CardActionArea>
                    <CardMedia
                        component="img"
                        alt="Contemplative Reptile"
                        className={classes.media}
                        height="100"
                        image={image}
                        title="Contemplative Reptile"
                    />
                    <CardContent>
                        <Typography gutterBottom variant="h5" component="h2">
                            Paella dish
                        </Typography>
                        <Typography component="p">
                            This impressive paella is a perfect party dish and a fun meal to cook together with your
                            guests...
                        </Typography>
                    </CardContent>
                    {/*<CardActions>*/}
                        {/*<Button size="small" color="primary">*/}
                            {/*Share*/}
                        {/*</Button>*/}
                        {/*<Button size="small" color="primary">*/}
                            {/*Learn More*/}
                        {/*</Button>*/}
                    {/*</CardActions>*/}
                </CardActionArea>
            </Card>
        )
    }
}

export default withStyles(styles)(RecipeCardSmall);