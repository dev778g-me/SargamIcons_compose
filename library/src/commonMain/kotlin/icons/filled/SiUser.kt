package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiUser: ImageVector
    get() {
        if (_SiUser != null) {
            return _SiUser!!
        }
        _SiUser = ImageVector.Builder(
            name = "Filled.SiUser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.25f, 7f)
                arcToRelative(5.75f, 5.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.5f, 0f)
                arcToRelative(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.5f, 0f)
                moveTo(11.798f, 14.261f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.13f, -0.011f)
                horizontalLineToRelative(0.144f)
                quadToRelative(0.066f, 0f, 0.13f, 0.011f)
                lineToRelative(7.295f, 1.283f)
                lineToRelative(0.038f, 0.008f)
                curveToRelative(1.344f, 0.31f, 2.788f, 1.163f, 3.069f, 2.82f)
                lineToRelative(0.004f, 0.029f)
                lineToRelative(0.114f, 0.877f)
                verticalLineToRelative(0.002f)
                curveToRelative(0.264f, 2.009f, -1.329f, 3.47f, -3.21f, 3.47f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.124f, -0.01f)
                horizontalLineToRelative(-14.9f)
                curveToRelative(-1.881f, 0f, -3.475f, -1.462f, -3.21f, -3.472f)
                lineToRelative(0.114f, -0.869f)
                lineToRelative(0.005f, -0.03f)
                curveToRelative(0.28f, -1.627f, 1.736f, -2.528f, 3.077f, -2.819f)
                lineToRelative(0.029f, -0.006f)
                close()
            }
        }.build()

        return _SiUser!!
    }

@Suppress("ObjectPropertyName")
private var _SiUser: ImageVector? = null
