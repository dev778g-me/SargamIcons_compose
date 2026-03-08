package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiWallet: ImageVector
    get() {
        if (_SiWallet != null) {
            return _SiWallet!!
        }
        _SiWallet = ImageVector.Builder(
            name = "Filled.SiWallet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.6f, 4f)
                horizontalLineTo(3.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 6.4f)
                verticalLineToRelative(11.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.4f, 20f)
                horizontalLineToRelative(15.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
                verticalLineTo(16f)
                horizontalLineToRelative(0.4f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, -2.6f)
                verticalLineToRelative(-2.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.4f, 8f)
                horizontalLineTo(21f)
                verticalLineTo(6.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.6f, 4f)
                moveToRelative(-2f, 6f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, 0.6f)
                verticalLineToRelative(2.8f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.6f, 0.6f)
                horizontalLineToRelative(4.8f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.6f, -0.6f)
                verticalLineToRelative(-2.8f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, -0.6f)
                close()
            }
        }.build()

        return _SiWallet!!
    }

@Suppress("ObjectPropertyName")
private var _SiWallet: ImageVector? = null
