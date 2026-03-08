package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiBarcodeScan: ImageVector
    get() {
        if (_SiBarcodeScan != null) {
            return _SiBarcodeScan!!
        }
        _SiBarcodeScan = ImageVector.Builder(
            name = "Filled.SiBarcodeScan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 5.4f)
                arcTo(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.4f, 4f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(5.4f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5.4f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(17f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(1.6f)
                arcTo(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 5.4f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                verticalLineTo(5.4f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.6f, 2f)
                close()
                moveTo(4f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(1.6f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.4f, 22f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(5.4f)
                arcTo(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 18.6f)
                close()
                moveTo(22f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(1.6f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.4f, 1.4f)
                horizontalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(1.6f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.4f, -3.4f)
                close()
                moveTo(1f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                close()
            }
        }.build()

        return _SiBarcodeScan!!
    }

@Suppress("ObjectPropertyName")
private var _SiBarcodeScan: ImageVector? = null
