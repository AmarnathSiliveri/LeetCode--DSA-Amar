import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    df=pd.DataFrame(players)
    k=[df.shape[0],df.shape[1]]
    return  k
    