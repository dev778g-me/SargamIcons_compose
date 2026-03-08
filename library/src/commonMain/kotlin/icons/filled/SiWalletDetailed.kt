package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiWalletDetailed: ImageVector
    get() {
        if (_SiWalletDetailed != null) {
            return _SiWalletDetailed!!
        }
        _SiWalletDetailed = ImageVector.Builder(
            name = "Filled.SiWalletDetailed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.995f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 14f)
                curveToRelative(0f, 0.552f, 0.445f, 1f, 0.995f, 1f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.55f, 0f, 0.995f, -0.448f, 0.995f, -1f)
                reflectiveCurveToRelative(-0.445f, -1f, -0.995f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.448f, 2f)
                horizontalLineToRelative(0.042f)
                curveTo(18.38f, 2f, 20f, 3.458f, 20f, 5.38f)
                verticalLineToRelative(0.923f)
                curveToRelative(1.178f, 0.535f, 2f, 1.723f, 2f, 3.097f)
                verticalLineToRelative(9.2f)
                curveToRelative(0f, 1.872f, -1.528f, 3.4f, -3.4f, 3.4f)
                horizontalLineTo(5.4f)
                arcTo(3.407f, 3.407f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18.6f)
                verticalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.453f, 3f)
                close()
                moveTo(18f, 5.38f)
                verticalLineTo(6f)
                horizontalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
                curveToRelative(0f, -0.278f, 0.222f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(0.042f)
                lineToRelative(11.985f, -1f)
                curveToRelative(0.87f, 0.018f, 1.473f, 0.672f, 1.473f, 1.38f)
                moveTo(21f, 11f)
                horizontalLineToRelative(-6.286f)
                curveToRelative(-0.947f, 0f, -1.714f, 0.716f, -1.714f, 1.6f)
                verticalLineToRelative(2.8f)
                curveToRelative(0f, 0.884f, 0.768f, 1.6f, 1.714f, 1.6f)
                horizontalLineTo(21f)
                close()
            }
        }.build()

        return _SiWalletDetailed!!
    }

@Suppress("ObjectPropertyName")
private var _SiWalletDetailed: ImageVector? = null
