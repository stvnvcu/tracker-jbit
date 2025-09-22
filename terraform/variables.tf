variable "region" {
  description = "AWS region"
  type        = string
  default     = "eu-central-1"
}

variable "account_id" {
  description = "AWS account ID"
  type        = string
  default     = "160382898307"
}

variable "repo_name" {
  description = "ECR repository name"
  type        = string
  default     = "tracker"
}

variable "github_repo" {
  description = "GitHub repo in 'org/repo' form"
  type        = string
  default     = "https://github.com/stvnvcu/tracker-jbit"
}
