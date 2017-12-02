
Pod::Spec.new do |s|
  s.name         = "RNReactNativeGemius"
  s.version      = "1.0.0"
  s.summary      = "RNReactNativeGemius"
  s.description  = <<-DESC
                  RNReactNativeGemius
                   DESC
  s.homepage     = ""
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "author@domain.cn" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/author/RNReactNativeGemius.git", :tag => "master" }
  s.source_files  = "RNReactNativeGemius/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  