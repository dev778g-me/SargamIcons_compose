package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiSpark: ImageVector
    get() {
        if (_SiSpark != null) {
            return _SiSpark!!
        }
        _SiSpark = ImageVector.Builder(
            name = "Filled.SiSpark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.995f, 21.005f)
                verticalLineToRelative(-6.588f)
                lineTo(6.34f, 19.072f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.414f, -1.414f)
                lineTo(9.584f, 13f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(6.574f)
                lineTo(4.926f, 6.352f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.34f, 4.937f)
                lineToRelative(4.655f, 4.656f)
                verticalLineTo(3.005f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(6.584f)
                lineToRelative(4.658f, -4.658f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.414f, 1.414f)
                lineTo(14.412f, 11f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-6.598f)
                lineToRelative(4.665f, 4.665f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, 1.414f)
                lineToRelative(-4.658f, -4.658f)
                verticalLineToRelative(6.584f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
            }
        }.build()

        return _SiSpark!!
    }

@Suppress("ObjectPropertyName")
private var _SiSpark: ImageVector? = null
