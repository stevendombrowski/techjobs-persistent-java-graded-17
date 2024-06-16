--Part 1

--Part 2
select name
from employer
where location = "St. Louis City";

--Part 3

DROP TABLE job;

--Part 4
select *
FROM skill
INNER JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;