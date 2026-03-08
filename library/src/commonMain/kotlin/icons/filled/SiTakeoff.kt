package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiTakeoff: ImageVector
    get() {
        if (_SiTakeoff != null) {
            return _SiTakeoff!!
        }
        _SiTakeoff = ImageVector.Builder(
            name = "Filled.SiTakeoff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.968f, 5.835f)
                curveToRelative(1.212f, -0.681f, 2.755f, -0.29f, 3.432f, 0.878f)
                lineTo(22.43f, 8.43f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.177f, 0.69f)
                lineToRelative(-10.355f, 6.036f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.148f, 0.057f)
                lineToRelative(-6.175f, 1.32f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.358f, -0.058f)
                lineToRelative(-3.47f, -2.044f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.009f, -0.866f)
                lineToRelative(0.851f, -0.48f)
                lineToRelative(0.005f, -0.002f)
                arcToRelative(2.54f, 2.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.828f, -0.232f)
                lineToRelative(1.225f, 0.174f)
                lineToRelative(3.73f, -2.209f)
                lineToRelative(-4.332f, -1.779f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 8.143f)
                lineToRelative(1.112f, -0.649f)
                lineToRelative(0.028f, -0.014f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.494f, -0.302f)
                lineToRelative(0.022f, 0.003f)
                lineToRelative(6.777f, 0.813f)
                lineToRelative(3.518f, -2.15f)
                close()
                moveTo(18f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                close()
            }
        }.build()

        return _SiTakeoff!!
    }

@Suppress("ObjectPropertyName")
private var _SiTakeoff: ImageVector? = null
