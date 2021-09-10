import Dashboard from "Pages/Dashboard";
import Home from "Pages/Home";
import { BrowserRouter, Route, Switch } from "react-router-dom";

const Routes = () => {
    return (
        <BrowserRouter>
            <switch>
                <Route path="/" exact>
                    <Home />
                </Route>
                <Route path="/dashboard" exact>
                    <Home />
                    <Dashboard />
                </Route>
            </switch>
        </BrowserRouter>
    );
}

export default Routes;