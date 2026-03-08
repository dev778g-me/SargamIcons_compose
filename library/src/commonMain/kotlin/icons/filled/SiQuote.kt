package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiQuote: ImageVector
    get() {
        if (_SiQuote != null) {
            return _SiQuote!!
        }
        _SiQuote = ImageVector.Builder(
            name = "Filled.SiQuote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.938f, 4.501f)
                curveToRelative(2f, -0.053f, 4.172f, 1.435f, 4.523f, 4.6f)
                lineToRelative(0.027f, 0.313f)
                lineToRelative(0.001f, 0.006f)
                curveToRelative(0.191f, 3.319f, -2.124f, 7.857f, -7.181f, 10.039f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.631f, -0.209f)
                lineToRelative(-1.11f, -1.919f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.188f, -0.686f)
                curveToRelative(1.71f, -0.962f, 3.043f, -2.471f, 3.845f, -4.302f)
                curveToRelative(-1.19f, -0.21f, -2.045f, -0.703f, -2.618f, -1.36f)
                curveToRelative(-0.667f, -0.766f, -0.905f, -1.7f, -0.905f, -2.517f)
                curveToRelative(0f, -2.214f, 1.703f, -4.005f, 3.86f, -3.965f)
                moveToRelative(10f, 0f)
                curveToRelative(2f, -0.053f, 4.172f, 1.435f, 4.523f, 4.6f)
                lineToRelative(0.027f, 0.313f)
                lineToRelative(0.001f, 0.006f)
                curveToRelative(0.191f, 3.319f, -2.124f, 7.857f, -7.181f, 10.039f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.631f, -0.209f)
                lineToRelative(-1.11f, -1.919f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.188f, -0.686f)
                curveToRelative(1.71f, -0.962f, 3.043f, -2.471f, 3.845f, -4.302f)
                curveToRelative(-1.19f, -0.21f, -2.045f, -0.703f, -2.618f, -1.36f)
                curveToRelative(-0.667f, -0.766f, -0.905f, -1.7f, -0.905f, -2.517f)
                curveToRelative(0f, -2.214f, 1.704f, -4.005f, 3.86f, -3.965f)
            }
        }.build()

        return _SiQuote!!
    }

@Suppress("ObjectPropertyName")
private var _SiQuote: ImageVector? = null
