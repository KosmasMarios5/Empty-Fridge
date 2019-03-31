import React from 'react';
import {Route, Switch} from 'react-router';
import FrontPage from "../pages/front";
import SearchPage from "../pages/search";
import RecipePage from "../pages/recipe";

const ContentRouter = () => {
  return(
      <Switch>
        <Route exact path="/" component={FrontPage}/>
        <Route path="/search" component={SearchPage} />
        <Route path="/recipe" component={RecipePage} />
      </Switch>
  );
};

export default ContentRouter;
