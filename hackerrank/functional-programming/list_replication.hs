
f n [] = []
f n (x:xs) = [x | i <- [1..n]] ++ (f n xs)

main = do
  n <- readLn :: IO Int
  inputdata <- getContents
  mapM_ putStrLn $ map show $ f n $ map (read :: String -> Int) $ lines inputdata
