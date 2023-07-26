import { Fragment } from "react";
import ProgressBar from "./ProgressBar";
import Button from "../UI/Button";
import { Link } from "react-router-dom";

const MainPage = () => {
  return (
    <Fragment>
      <ProgressBar />
      <div className="">
        <p>Lv. 3</p>
        <p>돈그만써</p>
      </div>
      <Link to="/300">
        <Button name="정산하기"></Button>
      </Link>
    </Fragment>
  );
};

export default MainPage;