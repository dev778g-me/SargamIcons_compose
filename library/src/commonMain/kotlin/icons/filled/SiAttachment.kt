package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAttachment: ImageVector
    get() {
        if (_SiAttachment != null) {
            return _SiAttachment!!
        }
        _SiAttachment = ImageVector.Builder(
            name = "Filled.SiAttachment",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 7.3f)
                curveToRelative(0f, -0.875f, -0.347f, -1.714f, -0.965f, -2.334f)
                arcToRelative(3.31f, 3.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.673f, -0.001f)
                horizontalLineToRelative(0.001f)
                lineToRelative(-9.397f, 9.398f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(3.31f, 3.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.671f)
                lineToRelative(0.119f, 0.113f)
                arcToRelative(3.31f, 3.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.554f, -0.113f)
                lineToRelative(6.35f, -6.354f)
                arcToRelative(1.35f, 1.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.907f)
                lineToRelative(-0.098f, -0.09f)
                arcToRelative(1.35f, 1.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.809f, 0.09f)
                lineTo(7.425f, 17.43f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, -1.414f)
                lineToRelative(6.656f, -6.658f)
                arcToRelative(3.35f, 3.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.614f, -0.114f)
                lineToRelative(0.12f, 0.114f)
                lineToRelative(0.001f, 0.001f)
                arcToRelative(3.35f, 3.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.734f)
                lineToRelative(-6.352f, 6.356f)
                arcToRelative(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.498f, 0f)
                horizontalLineTo(3.55f)
                arcToRelative(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -7.499f)
                lineToRelative(9.4f, -9.4f)
                arcToRelative(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.306f, -0.18f)
                lineToRelative(0.191f, 0.18f)
                lineToRelative(0.001f, 0.002f)
                arcToRelative(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 7.498f)
                lineToRelative(-0.138f, 0.137f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.413f, -1.414f)
                lineToRelative(0.136f, -0.136f)
                curveToRelative(0.619f, -0.62f, 0.966f, -1.46f, 0.966f, -2.336f)
            }
        }.build()

        return _SiAttachment!!
    }

@Suppress("ObjectPropertyName")
private var _SiAttachment: ImageVector? = null
