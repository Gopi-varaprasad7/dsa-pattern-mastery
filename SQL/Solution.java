// LeetCode 202
// Pattern : SQL Query
// Time : O(n)
# Write your MySQL query statement below
select user_id,MAX(time_stamp) as last_stamp from Logins where YEAR(time_stamp) = 2020 GROUP BY user_id;